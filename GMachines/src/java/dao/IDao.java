package dao;


import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lenovo
 */
public interface IDao<T>  {

    boolean create(T o) ;

    boolean delete(T o) ;

    boolean update(T o) ;

    T findById(int o) ;

    List<T> findAll() ;

}
