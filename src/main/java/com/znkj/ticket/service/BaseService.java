package com.znkj.ticket.service;

import com.github.pagehelper.PageHelper;
import com.znkj.ticket.mapper.AdminMapper;
import com.znkj.ticket.model.BaseEntity;
import com.znkj.ticket.util.MyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * 服务基类,实现一些基础的CRUD方法
 * @author yangjian
 * @since 2017-07-25
 */
public abstract class BaseService<M extends MyMapper, E extends BaseEntity> {

    @Autowired
    protected M mapper;


    /**
     * 添加数据
     * @param entity
     * @return
     */
    public E add(E entity) {
        if (mapper.insert(entity) >= 1) {
            return entity;
        } else {
            return null;
        }
    }

    /**
     * 根据 ID 主键删除元素
     * @param key
     * @return
     */
    public boolean delele(Object key) {
        return (mapper.deleteByPrimaryKey(key) >= 1);
    }

    /**
     * 根据Example条件进行查询
     * @param example
     * @return
     */
    public List<E> getItemsByCondition(Object example) {
        return mapper.selectByExample(example);
    }

    /**
     * 查询所有的元素
     * @return
     */
    public List<E> getAllItems() {
        return mapper.selectAll();
    }

    /**
     * 分页查询, 需要传入查询的实体对象
     * @param entity
     * @return
     */
    public List<E> getItemByPage(E entity) {
        if (entity.getPage() != null && entity.getRows() != null) {
            PageHelper.startPage(entity.getPage(), entity.getRows());
        }
        return mapper.selectAll();
    }

    /**
     * 根据实体中的属性进行查询，只能有一个返回值，有多个结果是抛出异常，查询条件使用等号
     * @param record
     * @return
     */
    public E getItem(Object record) {
        return (E) mapper.selectOne(record);
    }

    public E getItemById(Object id) {
        return (E) mapper.selectByPrimaryKey(id);
    }

    /**
     * 根据主键更新属性不为null的值
     * @param entity
     * @return
     */
    public boolean update(E entity) {
        if (null != entity.getId()) {
            return (mapper.updateByPrimaryKeySelective(entity) >= 1);
        }
        return false;
    }

    /**
     * 根据主键更新实体全部字段，null值会被更新
     * @param entity
     * @return
     */
    public boolean fullUpdate(E entity) {
        if (null != entity.getId()) {
            return (mapper.updateByPrimaryKey(entity) >= 1);
        }
        return false;
    }

}
