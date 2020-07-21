package com.linhan.bai.day04.myproject.service;

import com.linhan.bai.day04.myproject.bean.Customer;

/**
 * 
 * @author ZhangShengjie
 *
 * @date 2020��6��6������10:25:52
 */
public class CustomerList {
    private Customer[] customers;
    private int total = 0;

    /**
     * ��������������ʼ��customers����
     * 
     * @param totalCustomer
     */
    public CustomerList(int totalCustomer) {

        customers = new Customer[totalCustomer];
    }

    /**
     * 
     * @Description ��ӿͻ��ķ���
     * @author Bruce
     * @param customer
     * @return boolean ��ӳɹ�����true��false��ʾ�����������޷����
     */
    public boolean addCustomer(Customer customer) {
        if (total >= customers.length) {
            return false;
        }
        customers[total++] = customer;
        return true;
    }

    /**
     * 
     * @Description �޸Ŀͻ���Ϣ�ķ���
     * @author Bruce
     * @param index
     *            ָ�����滻�����������е�λ�ã���0��ʼ
     * @param cust
     * @return boolean �滻�ɹ�����true��false��ʾ������Ч���޷��滻
     * 
     */
    public boolean repalceCustomer(int index, Customer cust) {
        if (index < 0 || index >= total) {
            return false;
        }
        customers[index] = cust;
        return true;
    }

    /**
     * 
     * @Description ɾ���ͻ���Ϣ�ķ���
     * @author Bruce
     * @param index ָ����ɾ�������������е�����λ�ã���0��ʼ
     * @return boolean ɾ���ɹ�����true��false��ʾ������Ч���޷�ɾ��
     */
    public boolean deleteCustomer(int index) {
        if (index < 0 || index >= total) {
            return false;
        }
        for (int i = 0; i < total - 1; i++) {
            customers[i] = customers[i + 1];
        }
        customers[--total] = null;

        return true;
    }

    /**
     * 
     * @Description ��ȡȫ���ͻ���Ϣ
     * @author Bruce
     * @return Customer[]�����а����˵�ǰ���пͻ����󣬸����鳤������������ͬ��
     */
    public Customer[] getAllCustomers() {
        Customer[] custs = new Customer[total];
        for (int i = 0; i < total; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }

    /**
     * 
     * @Description TODO
     * @author Bruce
     * @param index
     * @return ��װ�˿ͻ���Ϣ��Customer����
     */
    public Customer getCustomer(int index) {
        if (index < 0 || index >= total) {
            return null;
        }
        return customers[index];
    }

    public int getTotal() {
        return total;
    }

}
