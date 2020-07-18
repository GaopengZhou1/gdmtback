package com.hubt.service.impl;

import com.hubt.mapper.OrgMapper;
import com.hubt.model.Org;
import com.hubt.model.TreeNode;
import com.hubt.service.OrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;
import java.sql.Timestamp;
import java.util.List;

@Service
public class OrgServiceImpl implements OrgService {
    @Autowired
    private OrgMapper orgMapper;

    @Override
    public boolean deleteOrg(String id) {
        return orgMapper.deleteOrg(id);
    }

    @Override
    public Org findOrgById(String id) {
        return orgMapper.findOrgById(id);
    }

    @Override
    public List<Org> findAll() {
        List<Org> allList = orgMapper.findAll();
        System.out.println(allList);
        return allList;
    }

    @Override
    public TreeNode findOrgsByParentId(String id) {
        return getTree(id);
    }

    @Override
    public boolean updateOrg(String organ_uuid, String organ_code, String organ_name, String organ_type, String in_use, String parent_uuid, String description, String account_code, String shortname) {
        Timestamp d = new Timestamp(System.currentTimeMillis());
        return orgMapper.updateOrg(organ_uuid,organ_code,organ_name,organ_type,in_use,parent_uuid,description,account_code,shortname,d,"","N");
    }

    @Override
    public boolean insertOrg(String organ_code, String organ_name, String organ_type, String in_use, String parent_uuid, String description, String account_code, String shortname) {
        Timestamp d = new Timestamp(System.currentTimeMillis());
        String organ_uuid= UUID.randomUUID().toString();
        return orgMapper.insertOrg(organ_uuid,organ_code,organ_name,organ_type,in_use,parent_uuid,description,account_code,shortname,d,"","N");
    }

    public TreeNode getTree(String rootId){
         TreeNode ans = new TreeNode();
         if(rootId.equals("-1")){
             ans.setId("-1");
             ans.setPid("-1");
             ans.setName("root");
         }
         else{
             Org org = orgMapper.findOrgById(rootId);
             ans.setId(org.getOrgan_uuid());
             ans.setPid(org.getParent_uuid());
             ans.setName(org.getOrgan_name());
         }
         List<Org> child = orgMapper.findOrgsByParentId(rootId);
         List<TreeNode> treeSet = new ArrayList<TreeNode>();
         if(child.size() == 0) {
             ans.setHasChildren(false);
         }
         else{
             ans.setHasChildren(true);
         }

         for(int i=0;i<child.size();i++){
             TreeNode tmp = getTree(child.get(i).getOrgan_uuid());
             treeSet.add(tmp);
         }
         ans.setChildren(treeSet);
         return ans;
    }
}
