package com.williamnews.controller.RestController;

import com.williamnews.Service.IPostCategoryService;
import com.williamnews.model.PostcategoryEntity;
import com.williamnews.model.Response;
import com.williamnews.model.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/postCategory")
@CrossOrigin("*")
public class PostCategoryApi {
    @Autowired
    private IPostCategoryService postCategoryService;
    Response rs = new Response();

    @RequestMapping(value = "/postCategoryApi", method = RequestMethod.GET)
    public Response postCategory() {
        Iterable<PostcategoryEntity> postcategorys = postCategoryService.findAll();
        rs.setData(postcategorys);
        rs.setStatus(ResponseStatus.SUCCESS);
        rs.setMessage("SUCCESS");
        return rs;
    }
    @RequestMapping(value = "/postCategoryApi", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Response CreatePostCategory(@RequestBody PostcategoryEntity postcategoryEntity) {
        postCategoryService.save(postcategoryEntity);
        rs.setData(postcategoryEntity);
        rs.setStatus(ResponseStatus.SUCCESS);
        rs.setMessage("SUCCESS");
        return rs;
    }
    @RequestMapping(value = "/DeletePostCategoryApi", method = RequestMethod.GET)
    public Response deletePostCategory(@RequestParam("CategoryId") int id) {
        postCategoryService.deleteById(id);
//        rs.setData();
        rs.setStatus(ResponseStatus.SUCCESS);
        rs.setMessage("SUCCESS");
        return rs;
    }
    @RequestMapping(value = "/EditPostCategoryApi", method = RequestMethod.POST)
    public Response EditPostCategory(@RequestBody PostcategoryEntity postcategoryEntity) {
        postCategoryService.save(postcategoryEntity);
        rs.setData(postcategoryEntity);
        rs.setStatus(ResponseStatus.SUCCESS);
        rs.setMessage("SUCCESS");
        return rs;
    }
}
