package com.example.test;

public class Main {
    public static void main(String[] args) {
        //TDD - test-driven-development
        //inji hamaren petq UNIT tester@
        //Modulniy tester@ stugumen kodi injvor mi hatvaci ashxaanq@
        //tester@ tuylen talis cragravoroxin hamozvel vor kod@ chishte ashxatum
        //heto iranq carayumen vorpes dakumentaciya vor urish@ karda haskana injenq gre

        //Mock  vs MockBean
        //Mock@ patrastume fiktivni object,,kareli stugel classi varqagic@

        //MockBean inq@ maketa avelacnum Springi applicationContextum,ete bean ka apa kpoxarini ete che kstexci nor@
        //ete mer modul tester@ kaxvacutyun chunen springi conteyneric menq mock enq anum
        //ete uni dependency apa mockBean

        //spy objectin hetevume ev karoxenq popoxutyunner anel vor@ irakanum chi azdi oreginal objecti vra
        //stub test@ menq ogtagorcumenq veradardznelov kexc tvyalner,stugumenq te mer grac logikan chishte ashxatum te che


        //What is @DataJpaTest?  sa jpa componentner@ test anelu hamare,
        //vorpeszi registracia anen sql requestner@ petqa properties-i mej avelacnenq    sa spring.jpa.show-sql = true
        //de bnakanabar zaprosner anelu hamar orinak save-@,petqe @autowired anenq EntityManager@

        //Integration tests vs unit tests

        //Unit tester@ testavorumen arandzin modulner@
        //integration tester@ testavorumen modulner@ irar het vercrac ayd xmbavorum@
        //integration tester@ himnakanum grumen testirovshikner@
        //Unit testerum xndir@ gtnel@ aveli heshte'
        //Unit tester@ katarvumen arajnayin
        //integration tester@ katarvum en unit testeric heto
        //Unit testov stugumes codi hatvaci chisht ashxatel@
        //integration testin chi hetaqrqrum kodi mej inje grac inq@ resultne stanum u stugumner anum

        //Testing FIRST principles
//        FAST
        //cragravorox@ petqe run tan modul tester@ cankacac pahi u da petqe ta cankali result
        //qani vor modul tester@ kodi poqr hatvacneren u bazayi het chen haxordakcvum petqe shat arag gorcarkven

//        ISOLATED/INDEPENDENT
        //Sa asume vor modul testere petqe linen ankax,,mek moduli ashxatanq@ chpetqe kaxvac lini myusic
        //ed dependence ner@ himnakanum Mock en arvecvum
        //

//        REPEATABLE
        //Modul tester@ petqe linen krkvox,injqanel run linen petqe tan nuyn ardyunq@,yuraqanchyur modul test petqe sahmani ira sepakan tvyalner@

//        SELF-VALIDATING
        //testerin kariq chka injvor stugumner dnel,vortev run taluc heto inq@ kam failed klini kam success

//        THROUGH
        //Modul tester@ petqe testavoren bolor Case er@

        //TESTING PIRAMIDA
        //skzbic Unit testernen
        //heto integration tester@
        //verjum Ui test@


        //Black Box Vs White Box
        //Black Box@ testavorman ayn dzevne erb testirovshikin hteaqrqir che nerqin strukturan injpisine Integration testerr@
        //White Box@ erb hetaqrqire nerqin strukturan injpisine orinak Modul tester@
        //Grey Box@ arden Web testne injpisine U/I testing@

    }
}
