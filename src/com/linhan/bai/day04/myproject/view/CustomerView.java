package com.linhan.bai.day04.myproject.view;

import com.linhan.bai.day04.myproject.bean.Customer;
import com.linhan.bai.day04.myproject.service.CustomerList;
import com.linhan.bai.day04.myproject.util.CMUtility;

/**
 * 
 * @author ZhangShengjie
 *
 * @date 2020��6��6������10:26:06
 */
public class CustomerView {
    private CustomerList customers = new CustomerList(10);

    // ��ʼ����һ���û�
    public CustomerView() {
        Customer cust = new Customer("����", '��', 30, "1151511215", "abs@163.com");
        customers.addCustomer(cust);
    }

    /**
     * 
     * @Description ��������棬��ʾ����
     * @author Bruce void
     */
    public void enterMainMenu() {
        boolean loopFlag = true;
        do {
            System.out.println("\n-----------------�ͻ���Ϣ�������-----------------\n");
            System.out.println("                   1 �� �� �� ��");
            System.out.println("                   2 �� �� �� ��");
            System.out.println("                   3 ɾ �� �� ��");
            System.out.println("                   4 �� �� �� ��");
            System.out.println("                   5 ��       ��\n");
            System.out.print("                   ��ѡ��(1-5)��");

            char key = CMUtility.readMenuSelection();
            System.out.println();

            switch (key) {
            case '1':
                addNewCustomer();
                break;
            case '2':
                modifyCustomer();
                break;
            case '3':
                deleteCustomer();
                break;
            case '4':
                listAllCustomer();
                break;
            case '5':
                System.out.println("�Ƿ��˳�(Y/N):");
                char yn = CMUtility.readConfirmSelection();
                if (yn == 'Y') {
                    loopFlag = false;
                }
                break;

            default:
                break;
            }

        } while (loopFlag);
    }

    /**
     * 
     * @Description ��ʾ����û�����
     * @author Bruce void
     */
    private void addNewCustomer() {
        System.out.println("---------------------��ӿͻ�---------------------");
        System.out.print("������");
        String name = CMUtility.readString(4);
        System.out.println("�Ա�");
        char gender = CMUtility.readChar();
        System.out.println("����");
        int age = CMUtility.readInt();
        System.out.println("�绰");
        String phone = CMUtility.readString(15);
        System.out.println("����");
        String email = CMUtility.readString(15);

        Customer cust = new Customer(name, gender, age, phone, email);
        boolean flag = customers.addCustomer(cust);
        if (flag) {
            System.out.println("---------------------������---------------------");
        } else {
            System.out.println("----------------��¼����,�޷����-----------------");
        }

    }

    /**
     * 
     * @Description ��ʾ�޸��û���Ϣ����
     * @author Bruce void
     */
    private void modifyCustomer() {
        System.out.println("---------------------�޸Ŀͻ�---------------------");
        int index = 0;
        Customer cust = null;
        for (;;) {
            System.out.print("��ѡ����޸Ŀͻ����(-1�˳�)��");
            index = CMUtility.readInt();
            if (index == -1) {
                return;
            }

            cust = customers.getCustomer(index - 1);
            if (cust == null) {
                System.out.println("�޷��ҵ����û�");
            } else
                break;
        }

        System.out.println("����(" + cust.getName() + "):");
        String name = CMUtility.readString(4, cust.getName());

        System.out.println("�Ա�(" + cust.getGender() + "):");
        char gender = CMUtility.readChar(cust.getGender());

        System.out.println("����(" + cust.getAge() + "):");
        int age = CMUtility.readInt(cust.getAge());

        System.out.println("�绰(" + cust.getPhone() + "):");
        String phone = CMUtility.readString(15, cust.getPhone());

        System.out.println("����(" + cust.getEmail() + "):");
        String email = CMUtility.readString(15, cust.getEmail());

        cust = new Customer(name, gender, age, phone, email);

        boolean flag = customers.repalceCustomer(index - 1, cust);
        if (flag) {
            System.out.println("---------------------�޸����---------------------");
        } else {
            System.out.println("----------�޷��ҵ�ָ���ͻ�,�޸�ʧ��--------------");
        }

    }

    /**
     * 
     * @Description ɾ���û�����
     * @author Bruce void
     */
    private void deleteCustomer() {
        System.out.println("---------------------ɾ���ͻ�---------------------");
        int index = 0;
        Customer cust = null;
        for (;;) {
            System.out.println("ѡ���ɾ���ͻ��ı��(-1�˳�)");
            index = CMUtility.readInt();
            if (index == -1) {
                return;
            }

            cust = customers.getCustomer(index - 1);
            if (cust == null) {
                System.out.println("�޷��ҵ�ָ���ͻ�");
            } else
                break;

        }
        // ����ѭ���Ƿ�ɾ��
        System.out.println("�Ƿ�ɾ���ͻ�(Y/N)");
        char yn = CMUtility.readChar();
        if (yn == 'N')
            return;

        boolean flag = customers.deleteCustomer(index - 1);
        if (flag) {
            System.out.println("---------------------ɾ�����---------------------");
        } else {
            System.out.println("----------�޷��ҵ�ָ���ͻ�,ɾ��ʧ��--------------");
        }
    }

    /**
     * 
     * @Description �г��ͻ��б�
     * @author Bruce void
     */
    private void listAllCustomer() {
        System.out.println("---------------------------�ͻ��б�---------------------------");
        Customer[] custs = customers.getAllCustomers();
        if (custs.length == 0) {
            System.out.println("û�пͻ���ţ�");

        } else {
            System.out.println("���\t����\t�Ա�\t����\t\t�绰\t\t����");
            for (int i = 0; i < custs.length; i++) {
                System.out.println((i + 1) + "\t" + custs[i].getDetails());
            }
        }

        System.out.println("-------------------------�ͻ��б����-------------------------");

    }

}
