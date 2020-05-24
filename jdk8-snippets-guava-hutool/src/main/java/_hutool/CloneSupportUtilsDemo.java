package _hutool;

import cn.hutool.core.clone.CloneSupport;
import cn.hutool.core.lang.Console;
import cn.hutool.core.util.ObjectUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-05-24 12:59
 */
public class CloneSupportUtilsDemo {

    @ToString
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    private static class Cat extends CloneSupport<Cat> implements Serializable {
        private String name = "miao";
        private int age = 0;
        private Cat children = null;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat clone = cat.clone();
        clone.setAge(12);
        Console.log("origin --> {}", clone);

        clone.setChildren(new Cat("miaomiao", 123, null));
        Cat clone1 = clone.clone();
        // 浅拷贝
        clone1.getChildren().setAge(888);
        System.out.println("clone --> " + clone1);

        // 深拷贝
        Cat deepClone = ObjectUtil.cloneByStream(clone1);
        clone1.getChildren().setAge(999);
        System.out.println("deepClone --> " + deepClone);

/*
origin --> CloneSupportUtilsDemo.Cat(name=miao, age=12, children=null)
clone --> CloneSupportUtilsDemo.Cat(name=miao, age=12, children=CloneSupportUtilsDemo.Cat(name=miaomiao, age=888, children=null))
deepClone --> CloneSupportUtilsDemo.Cat(name=miao, age=12, children=CloneSupportUtilsDemo.Cat(name=miaomiao, age=888, children=null))
*/

    }
}
