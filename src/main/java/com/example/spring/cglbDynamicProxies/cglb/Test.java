package com.example.spring.cglbDynamicProxies.cglb;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        //CGLB-@ kastarvume @st jarangakanutyan,aysinqn kjaranqi tvyal class@
        //@cofiguration class@ chpetqe lini final, methodnernel chpetqe linen final kam private.
        //CGLB-i depqun qani angamel kanchvi method@ menak arajin angam kstecvi bean,mnacac kancher@ uxxaki containeric kveradardznen goyutyun unecox bean@
        //ete Bean veradardznox method@ statice apa CGLB @ chi gorci,qani vor static@ verabervume classin

        //Rules of the - CGLB
        //@Configuration class shouldn't be final
        //@Bean methods shouldn't be final
        //@Bean methods shouldn't be private

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Tool tool = context.getBean(Tool.class);
        Worker firstWorker = context.getBean(Worker.class);
        Worker secondWorker = context.getBean(Worker.class);
        Prot prot = context.getBean(Prot.class);
        Prot prot2 = context.getBean(Prot.class);

        //ays erku depqum kveradardzni false qani vor proxy-n chi ashxatum ete Bean veradardznox method@ statice
        System.out.println(tool == firstWorker.getTool());
        System.out.println(tool == secondWorker.getTool());

        //ays depqumel kstexci false qani vor bean-i scop@ tvelenq prototype
        System.out.println(prot==prot2);

        //erku depqumel true qani vor prox-n stexcume miayn mek bean ev mnacac kancheri depqum conatineric veradardznume goyutyun unecox bean@
        System.out.println(firstWorker == secondWorker);
        System.out.println(firstWorker.getTool() == secondWorker.getTool());
    }
}
