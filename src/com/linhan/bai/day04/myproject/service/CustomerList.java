package com.linhan.bai.day04.myproject.service;

import com.linhan.bai.day04.myproject.bean.Customer;

/**
 * 
 * @author ZhangShengjie
 *
 * @date 2020年6月6日下午10:25:52
 */
public class CustomerList {
    private Customer[] customers;
    private int total = 0;

    /**
     * 构造器，用来初始化customers数组
     * 
     * @param totalCustomer
     */
    public CustomerList(int totalCustomer) {

        customers = new Customer[totalCustomer];
    }

    /**
     * 
     * @Description 添加客户的方法
     * @author Bruce
     * @param customer
     * @return boolean 添加成功返回true；false表示数组已满，无法添加
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
     * @Description 修改客户信息的方法
     * @author Bruce
     * @param index
     *            指定所替换对象在数组中的位置，从0开始
     * @param cust
     * @return boolean 替换成功返回true；false表示索引无效，无法替换
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
     * @Description 删除客户信息的方法
     * @author Bruce
     * @param index 指定所删除对象在数组中的索引位置，从0开始
     * @return boolean 删除成功返回true；false表示索引无效，无法删除
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
     * @Description 获取全部客户信息
     * @author Bruce
     * @return Customer[]数组中包含了当前所有客户对象，该数组长度与对象个数相同。
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
     * @return 封装了客户信息的Customer对象
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
