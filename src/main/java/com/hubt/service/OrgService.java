package com.hubt.service;

import com.hubt.model.Org;
import com.hubt.model.TreeNode;


import java.util.List;

public interface OrgService {
    boolean deleteOrg(String id);

    Org findOrgById(String id);

    List<Org> findAll();

    TreeNode findOrgsByParentId(String id);

    boolean updateOrg(String organ_uuid,String organ_code,String organ_name,String organ_type,String in_use,String parent_uuid,String description,String account_code,String shortname);

    boolean insertOrg(String organ_code,String organ_name,String organ_type,String in_use,String parent_uuid,String description,String account_code,String shortname);
}
