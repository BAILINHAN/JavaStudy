package com.linhan.bai.myProject03.team.service;
/**
 * 关于开发团队成员的管理:添加，删除等。
 * 
 * @author ZhangShengjie
 *
 * @date 2020年8月2日下午3:59:45
 */

import com.linhan.bai.myProject03.team.domain.Architect;
import com.linhan.bai.myProject03.team.domain.Designer;
import com.linhan.bai.myProject03.team.domain.Employee;
import com.linhan.bai.myProject03.team.domain.Programmer;

/**
 * @author ZhangShengjie
 *
 * @date 2020年8月2日下午10:41:38
 */
/**
 * @author ZhangShengjie
 *
 * @date 2020年8月2日下午10:41:41
 */
public class TeamService {
	
	private static int counter = 1;//给memberId赋值用
	private final int MAX_MEMBER = 5;//限制开发团队的人数
	private Programmer[] team = new Programmer[MAX_MEMBER];//保存开发团队的成员
	private int total;//记录开发团队中实际的人数

	public TeamService() {
		super();
	}
	
	/**
	 * @Description 获取	开发团队中所有成员
	 * @author ZhangShengjie
	 *
	 * @date 2020年8月2日下午4:10:48
	 */
	public Programmer[] getTeam() {
		Programmer[] team = new Programmer[total];
		for (int i = 0; i < team.length; i++) {
			team[i] = this.team[i];
		}
		return team;
	}
	
	
	/**
	 * @Description 将指定的员工添加到开发团队中
	 * @author ZhangShengjie
	 *
	 * @date 2020年8月2日下午6:05:57
	 */
	public void addMember(Employee e) throws TeamException{
		//成员已满，无法添加
		if(total >= MAX_MEMBER) {
			throw new TeamException("成员已满，无法添加");
		}
		//该成员不是开发人员，无法添加
		if(!(e instanceof Programmer)) {
			throw new TeamException("该成员不是开发人员，无法添加");
		}
		//该成员已在本开发团队中
		if(isExist(e)) {
			throw new TeamException("该员工已在本开发团队中");
		}
		//该员工已是某团队成员
		//该员工正在休假，无法添加
		Programmer p = (Programmer)e;
		if("BUSY".equals(p.getStatus().getNAME())) {
			throw new TeamException("该员工已是某团队成员");
		}else if("VOCATION".equals(p.getStatus().getNAME())){
			throw new TeamException("该员工正在度假，无法添加");
		}
		
		//团队中至多只能有一名架构师
		//团队中至多只能有两名设计师
		//团队中至多只能有三名程序员
		//获取team已有成员中架构师，设计师，程序员的人数
		int numOfArch = 0,numOfDes = 0, numOfPro = 0;
		for (int i = 0; i < total; i++) {
			if(team[i] instanceof Architect) {
				numOfArch++;
			}else if(team[i] instanceof Designer) {
				numOfDes++;
			}else if(team[i] instanceof Programmer) {
				numOfPro++;
			}
		}
		if(p instanceof Architect) {
			if(numOfArch >= 1) {
				throw new TeamException("团队中至多只能有一名架构师");
			}
		}else if(p instanceof Designer) {
			if(numOfDes >= 2) {
				throw new TeamException("团队中至多只能有两名设计师");
			}
		}else if(p instanceof Programmer) {
			if(numOfPro >= 3) {
				throw new TeamException("团队中至多只能有三名程序员");
			}
		}
		
		//将p(或e)添加到现有的team中
		team[total++] = p;
		//p的属性的赋值
		p.setStatus(Status.BUSY);
		p.setMemberId(counter++);
		
		
	}
	
	/**
	 * 判断指定的员工是否已经存在于现有的开发团队中
	 * 
	 * @author ZhangShengjie
	 *
	 * @date 2020年8月2日下午8:49:22
	 */
	private boolean isExist(Employee e) {
		
		for (int i = 0; i < total; i++) {
			if(team[i].getId() == e.getId()) {
				return team[i].getId() == e.getId();
			}
		}
		
		return false;
	}

	
	/**
	 * 从团队当中删除成员
	 * 
	 * @author ZhangShengjie
	 * @throws TeamException 
	 *
	 * @date 2020年8月2日下午10:41:43
	 */
	public void removeMember(int memberId) throws TeamException {
		int i;
		for ( i = 0; i < total; i++) {
			if(team[i].getMemberId() == memberId) {
				team[i].setStatus(Status.FREE);
				break;
			}
		}
		
		//未找到指定memberId的情况
		if(i == total) {
			throw new TeamException("找不到指定memberId的员工，删除失败");
		}
		
		//后一个元素覆盖前一个元素，实现删除操作
		for (int j = i + 1; j < total; j++) {
			team[j - 1] = team[j];
		}
		//写法一：
		//team[total - 1] = null;
		//total--;
		
		//写法二：
		team[--total] = null;
		
	}
	
	

}
