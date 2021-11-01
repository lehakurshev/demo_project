package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RestController
class ApiController {


    /*
    @GetMapping("books")
    public ResponseEntity<String> getText() {
        return ResponseEntity.ok("Hello text!");
    }
     */
/*
        private List<String> messages = new ArrayList<>();
        @GetMapping("messages")
        public List<String> getMessages
        () {
            return messages;
        }

 */
        /* curl -X POST http://localhost:8080/messages -H 'Content-Type:
       text/plain' -d 'text' */
    /*
        @PostMapping("messages")
        public void addMessage
        (@RequestBody String text) {
            messages.add(text);
        }
        // curl -X GET "http://localhost:8080/messages/0"

        @GetMapping("messages/{index}")
        public String getMessage
                (@PathVariable("index") Integer index) {
            return messages.get(index);
        }
        // curl -X DELETE http://localhost:8080/messages/{index}

        @DeleteMapping("messages/{index}")
        public void deleteText
                (@PathVariable("index") Integer index) {
            messages.remove((int) index);
        }
        @PutMapping("messages/{index}")
        public void updateMessage(
                @PathVariable("index") Integer i,
                @RequestBody String message) {
            messages.remove((int) i);
            messages.add(i, message);
        }
        @GetMapping("messeges/count")
        public Integer countMesseges(){
            return messages.size();
        }
        @PostMapping("messages/{index}")
        public void Messagecreate(
                @PathVariable("index") Integer i,
                @RequestBody String message) {
            messages.add(i, message);
        }
    @GetMapping("messages/search/{text}")
    public int getMessagetext(@PathVariable("text") String text) {
        int i1 = 0;
        for(int i = 0; i<messages.size(); i++) {
            String text1 = messages.get(i);
            if (text1.contains(text)) {
                i1 = i;
            }
        }
        return i1;
    }
    @DeleteMapping("messages")
    public void deleteallText() {
        for (int i = 0; i < messages.size(); i++) {
            String a = messages.get(i);
            if (a.contains("text")) {
                messages.remove(i);
            }
        }
    }
*/

    private List<String> lists = new ArrayList<>();

    //$ curl -X POST http://localhost:8080/lists -H 'Content-Type: text/plain' -d 'text'
    @PostMapping("lists")
    public void addMessage
            (@RequestBody String text) {
        lists.add(text);
    }

    //$ curl -X DELETE http://localhost:8080/lists/0
    @DeleteMapping("lists/{index}")
    public void deleteList
            (@PathVariable("index") Integer index) {
        lists.remove((int) index);
    }

    @GetMapping("lists")
    public List<String> getList() {
        return lists;
    }
    //curl -X PUT http://localhost:8080/lists/0 -H 'Content-Type: text/plain' -d 'text'
    @PutMapping("lists/{index}")
    public void updateList(
            @PathVariable("index") Integer i,
            @RequestBody String message) {
        lists.remove((int) i);
        lists.add(i, message);
    }

    @GetMapping("lists/count")
    public Integer getListscount() {
        return (lists.size());
    }
    //curl -X DELETE http://localhost:8080/lists -H 'Content-Type: text/plain' -d 'text'
    @DeleteMapping("lists")
    public void deleteallLists() {
        for (int i = 0; i <lists.size(); i++) {
            lists.remove(i);
        }
    }
    //curl -X GET http://localhost:8080/lists/0
    @GetMapping("lists/{index}")
    public String getList(@PathVariable("index") Integer index) {
        return lists.get(index);
    }



}