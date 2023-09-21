package com.example.exception.reThrowing;


public class Example {

    public static void main(String[] args) {

        //linuma depq erb Catch block@ chi karox handle ene exception@ ev menqa karoxenq catch blocki mejic throw anel
        //mez petqa rethrow anel aveli manramasnelu exception@ te konkret inj operationi jamanake ayn texi unecel
        //aysinq menq unenq depq erb karoxenq cachi mej unenal orinak SqlSyntaxException injvor sql operation execute chi exel
        //ev ayd catche-i mej throw anel userNotStored Exception ,aveli manramsnenq exceptioni cagum@
        //npatak@ aveli bardzr makardakum handle enelne


//        try {
//            userStoredService();
//        } catch (UserNotStoredException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public static void userStoredService() throws UserNotStoredException {
//
//        try {
//            //execute SQL statements.
//            //trying to store user in database we got SqlException
//            throw new SQLException();
//        } catch (Exception e) {
//            throw new UserNotStoredException("During save operation something went wrong");
//        }
    }

}
