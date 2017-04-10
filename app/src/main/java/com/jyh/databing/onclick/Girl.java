package com.jyh.databing.onclick;

/**
 * Created by Administrator on 2017/4/5.
 */

public class Girl {
    String name;
    Boolean isBoyFriend;
    public Girl(String name, Boolean isBoyFriend) {
        this.name = name;
        this.isBoyFriend = isBoyFriend;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getBoyFriend() {
        return isBoyFriend;
    }

    public void setBoyFriend(Boolean boyFriend) {
        isBoyFriend = boyFriend;
    }
}
