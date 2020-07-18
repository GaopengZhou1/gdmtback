package com.hubt.mapper;

import com.hubt.model.Org;
import org.apache.ibatis.annotations.*;

import java.sql.Timestamp;
import java.util.List;

public interface OrgMapper {
    @Insert("insert into pt_organ values (#{organ_uuid},#{organ_code},#{organ_name},#{organ_type},#{in_use},#{parent_uuid},#{status},#{modifierid},#{modtime,jdbcType=TIMESTAMP},#{description},#{account_code},#{shortname})")
    boolean insertOrg(@Param("organ_uuid") String organ_uuid,@Param("organ_code") String organ_code,@Param("organ_name") String organ_name,@Param("organ_type") String organ_type,@Param("in_use") String in_use,@Param("parent_uuid") String parent_uuid,@Param("description") String description,@Param("account_code") String account_code,@Param("shortname") String shortname,@Param("modtime") Timestamp modtime,@Param("modifierid")String modifierid,@Param("status")String status);

    @Update("update pt_organ set organ_code=#{organ_code},organ_name=#{organ_name},organ_type=#{organ_type},in_use=#{in_use},parent_uuid=#{parent_uuid},status=#{status},modifierid=#{modifierid},modtime=#{modtime,jdbcType=TIMESTAMP},description=#{description},account_code=#{account_code},shortname=#{shortname} where organ_uuid=#{organ_uuid}")
    boolean updateOrg(@Param("organ_uuid") String organ_uuid,@Param("organ_code") String organ_code,@Param("organ_name") String organ_name,@Param("organ_type") String organ_type,@Param("in_use") String in_use,@Param("parent_uuid") String parent_uuid,@Param("description") String description,@Param("account_code") String account_code,@Param("shortname") String shortname,@Param("modtime") Timestamp modtime,@Param("modifierid")String modifierid,@Param("status")String status);

    @Delete("delete from pt_organ where organ_uuid=#{id}")
    boolean deleteOrg(String id);

    @Select("select * from pt_organ where organ_uuid=#{id}")
    Org findOrgById(@Param("id") String id);

    @Select("select * from pt_organ")
    List<Org> findAll();

    @Select("select * from pt_organ where parent_uuid=#{pid}")
    List<Org> findOrgsByParentId(@Param("pid") String id);
}
