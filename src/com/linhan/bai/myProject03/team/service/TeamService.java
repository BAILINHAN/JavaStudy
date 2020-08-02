package com.linhan.bai.myProject03.team.service;
/**
 * ���ڿ����Ŷӳ�Ա�Ĺ���:��ӣ�ɾ���ȡ�
 * 
 * @author ZhangShengjie
 *
 * @date 2020��8��2������3:59:45
 */

import com.linhan.bai.myProject03.team.domain.Architect;
import com.linhan.bai.myProject03.team.domain.Designer;
import com.linhan.bai.myProject03.team.domain.Employee;
import com.linhan.bai.myProject03.team.domain.Programmer;

public class TeamService {
	
	private static int counter = 1;//��memberId��ֵ��
	private final int MAX_MEMBER = 5;//���ƿ����Ŷӵ�����
	private Programmer[] team = new Programmer[MAX_MEMBER];//���濪���Ŷӵĳ�Ա
	private int total;//��¼�����Ŷ���ʵ�ʵ�����

	public TeamService() {
		super();
	}
	
	/**
	 * @Description ��ȡ	�����Ŷ������г�Ա
	 * @author ZhangShengjie
	 *
	 * @date 2020��8��2������4:10:48
	 */
	public Programmer[] getTeam() {
		Programmer[] team = new Programmer[total];
		for (int i = 0; i < team.length; i++) {
			team[i] = this.team[i];
		}
		return team;
	}
	
	
	/**
	 * @Description ��ָ����Ա����ӵ������Ŷ���
	 * @author ZhangShengjie
	 *
	 * @date 2020��8��2������6:05:57
	 */
	public void addMember(Employee e) throws TeamException{
		//��Ա�������޷����
		if(total >= MAX_MEMBER) {
			throw new TeamException("��Ա�������޷����");
		}
		//�ó�Ա���ǿ�����Ա���޷����
		if(!(e instanceof Programmer)) {
			throw new TeamException("�ó�Ա���ǿ�����Ա���޷����");
		}
		//�ó�Ա���ڱ������Ŷ���
		if(isExist(e)) {
			throw new TeamException("��Ա�����ڱ������Ŷ���");
		}
		//��Ա������ĳ�Ŷӳ�Ա
		//��Ա�������ݼ٣��޷����
		Programmer p = (Programmer)e;
		if("BUSY".equals(p.getStatus().getNAME())) {
			throw new TeamException("��Ա������ĳ�Ŷӳ�Ա");
		}else if("VOCATION".equals(p.getStatus().getNAME())){
			throw new TeamException("��Ա�����ڶȼ٣��޷����");
		}
		
		//�Ŷ�������ֻ����һ���ܹ�ʦ
		//�Ŷ�������ֻ�����������ʦ
		//�Ŷ�������ֻ������������Ա
		//��ȡteam���г�Ա�мܹ�ʦ�����ʦ������Ա������
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
				throw new TeamException("�Ŷ�������ֻ����һ���ܹ�ʦ");
			}
		}else if(p instanceof Designer) {
			if(numOfDes >= 2) {
				throw new TeamException("�Ŷ�������ֻ�����������ʦ");
			}
		}else if(p instanceof Programmer) {
			if(numOfPro >= 3) {
				throw new TeamException("�Ŷ�������ֻ������������Ա");
			}
		}
		
		//��p(��e)��ӵ����е�team��
		team[total++] = p;
		//p�����Եĸ�ֵ
		p.setStatus(Status.BUSY);
		p.setMemberId(counter++);
		
		
	}
	
	/**
	 * �ж�ָ����Ա���Ƿ��Ѿ����������еĿ����Ŷ���
	 * 
	 * @author ZhangShengjie
	 *
	 * @date 2020��8��2������8:49:22
	 */
	private boolean isExist(Employee e) {
		
		for (int i = 0; i < total; i++) {
			return team[i].getId() == e.getId();
		}
		
		return false;
	}

	public void removeMember(int memberId) {
		
	}
	
	

}
