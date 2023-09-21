package com.example.designPatterns.creation.builder;

import java.util.Date;

public class Test {

    public static void main(String[] args) {
        TaskBuilder builder = new TaskBuilder()
                .setId(1)
                .setSummary("sum")
                .setDescription("desc")
                .setDeadline(new Date())
                .setCreationDate(new Date())
                .setAssigned(new Object()).builder();

        System.out.println(builder);

        //ete sarqumenq onbject ev chenq uzum vor bolor fielder@ unenan arjeqner builder@ shat harmare
        //hamematac constructori het aveli gexecika builder@`     TaskBuilder(1,null,null,"Valod",null,null)
        TaskBuilder taskBuilder = new TaskBuilder().setId(1).setAssigned("Valod").builder();
        System.out.println(taskBuilder);
    }
}
