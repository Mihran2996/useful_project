package com.example.streamApi.SOLID;

public class Main {

    //SOLID

    //S - SINGLE RESPONSIBILITY
    //sa nshanakaume vor class@ peteqe patasxanatu lini mek gorcunetutyan hamar

    //O - OPEN-CLOSED
    //nshanakume petqe bac lini @ndlaynman hamar ev pak lini popoxutyan depqum
    //Urenak unenq mi hat Class vorin uzumenq avelacnel ayl havelyal fielder kam metodner
    //menq kjarangen iranic @ndlyanelov nran ev hamatex chpoxelov strukturan
    //orinak List realizacnume Collection@

    //L- LISKOV-SUBSTITUTION
    //Super classi objectner@ karoxen poxarinvel Sub classi Objectnerov bayc chxatarelov structuran
    //orinak ete super class@-i mek method veradardznume boolean,sub class@ iravunq chuni orinak override anel ev qcel exception


    //I -INTERFACE SEGREGATION
    //Sa asume vor Mec interfacener@ petq bajanven poqr interfaceneri,
    // vor irenc realizacnox classner@ menak hog tanen ayn methodneri hamar voronq vor irenc petqen

    //D - DEPENDENCY INVERSION
    //sa nshanakum e vor bardzr astchani modulner@ chpetqe kaxvacutyun unenan irenic cacar astchani modulneric
    //petqe pahpanel abstrackcia
    //orinak controller@ miangamic chpetqa kanchi repository-i methodner@
    //ete menq orinak uzenanq vor merd db-i het ashxatanq@ katarvi MongoDb ov menq popoxutyunenq mtcneli conrolleri mej
    //vornel arden xaxtume open closed princip@
    //dra hamar kunenanq iterface vor@ uni db- het ashxateli bolo basic methodner@
    //kunenq ayd interfacen realizacnox ham MySqli service Ham Mongo db i servic
    //ev mer Controller@ ir mot kpahi menak Interfacei object@
    //ev ays depqum karoxenq ham MongoDb-i object tal ira hamar ashxati ev MySqli object vornel kashxati ira hamar
}
