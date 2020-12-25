package com.williamnews.controller.RestController;

import com.williamnews.Service.IPostService;
import com.williamnews.model.PostEntity;
import com.williamnews.model.Response;
import com.williamnews.model.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/post")
public class PostApi {
    @Autowired
    private IPostService postService;
    Response rs = new Response();

    @RequestMapping(value = "/postApi", method = RequestMethod.GET)
    public Response post() {
        Iterable<PostEntity> posts = postService.findAll();
        rs.setData(posts);
        rs.setStatus(ResponseStatus.SUCCESS);
        rs.setMessage("SUCCESS");
        return rs;
    }
    @RequestMapping(value = "/postApi", method = RequestMethod.POST)
    public Response CreatePost(@RequestBody PostEntity postEntity) {
        postService.save(postEntity);
        rs.setData(postEntity);
        rs.setStatus(ResponseStatus.SUCCESS);
        rs.setMessage("SUCCESS");
        return rs;
    }
    @RequestMapping(value = "/deletePostApi", method = RequestMethod.GET)
    public Response DeletePost(@RequestParam("PostId") int id) {
        postService.deleteById(id);
//        rs.setData(postEntity);
        rs.setStatus(ResponseStatus.SUCCESS);
        rs.setMessage("SUCCESS");
        return rs;
    }
    @RequestMapping(value = "/editPostApi", method = RequestMethod.GET)
    public Response editPost(@RequestBody PostEntity postEntity) {
        postService.save(postEntity);
        rs.setData(postEntity);
        rs.setStatus(ResponseStatus.SUCCESS);
        rs.setMessage("SUCCESS");
        return rs;
    }
}
