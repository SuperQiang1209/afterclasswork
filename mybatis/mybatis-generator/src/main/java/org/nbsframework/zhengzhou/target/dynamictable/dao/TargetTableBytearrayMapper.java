package org.nbsframework.zhengzhou.target.dynamictable.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.nbsframework.zhengzhou.target.dynamictable.vo.TargetTableBytearray;
import org.nbsframework.zhengzhou.target.dynamictable.vo.TargetTableBytearrayExample;

public interface TargetTableBytearrayMapper {
    long countByExample(TargetTableBytearrayExample example);

    int deleteByExample(TargetTableBytearrayExample example);

    int deleteByPrimaryKey(String id);

    int insert(TargetTableBytearray record);

    int insertSelective(TargetTableBytearray record);

    List<TargetTableBytearray> selectByExampleWithBLOBs(TargetTableBytearrayExample example);

    List<TargetTableBytearray> selectByExample(TargetTableBytearrayExample example);

    TargetTableBytearray selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TargetTableBytearray record, @Param("example") TargetTableBytearrayExample example);

    int updateByExampleWithBLOBs(@Param("record") TargetTableBytearray record, @Param("example") TargetTableBytearrayExample example);

    int updateByExample(@Param("record") TargetTableBytearray record, @Param("example") TargetTableBytearrayExample example);

    int updateByPrimaryKeySelective(TargetTableBytearray record);

    int updateByPrimaryKeyWithBLOBs(TargetTableBytearray record);

    int updateByPrimaryKey(TargetTableBytearray record);
}