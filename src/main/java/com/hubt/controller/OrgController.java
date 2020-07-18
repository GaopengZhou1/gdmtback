package com.hubt.controller;

import com.hubt.model.Org;
import com.hubt.model.TreeNode;
import com.hubt.service.OrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
@RequestMapping("/org")
public class OrgController {
    @Autowired
    private OrgService orgService;

    @RequestMapping("/getOrgs")
    @ResponseBody
    public List<Org> findAllOrgs(){
        return orgService.findAll();
    }

    @RequestMapping("/getOrg")
    @ResponseBody
    public Org findOrgById(String uuid){
        return orgService.findOrgById(uuid);
    }

    @RequestMapping("/getOrgsByParentId")
    @ResponseBody
    TreeNode findOrgsByParentId(String parentUUID){
        return orgService.findOrgsByParentId(parentUUID);
    }

    @RequestMapping("/update")
    @ResponseBody
    public boolean updateOrg(String organ_uuid,String organ_code,String organ_name,String organ_type,String in_use,String parent_uuid,String description,String account_code,String shortname){
        return orgService.updateOrg(organ_uuid,organ_code, organ_name, organ_type, in_use,parent_uuid,description,account_code,shortname);
    }

    @RequestMapping("/insert")
    @ResponseBody
    public boolean insertOrg(String organ_code,String organ_name,String organ_type,String in_use,String parent_uuid,String description,String account_code,String shortname){
        return orgService.insertOrg(organ_code, organ_name, organ_type, in_use,parent_uuid,description,account_code,shortname);
    }

    @RequestMapping("/remove")
    @ResponseBody
    public boolean deleteOrg(String id){
        return orgService.deleteOrg(id);
    }
}
