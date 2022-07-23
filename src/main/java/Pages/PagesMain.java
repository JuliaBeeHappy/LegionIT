package Pages;

public class PagesMain {
    public static void main(String[] args) {
//        Page loginScreen = new Page ("Login", 1, "www.legionIT.com/login");
//        loginScreen.pageId = 1;
//        loginScreen.pageName = "Login";
//        loginScreen.URL = "www.legionIT.com/login";
//
//        loginScreen.openPage();
//        loginScreen.clickButton("Login");
//        loginScreen.closePage();
//
//
//        Page aboutScreen = new Page ();
//        aboutScreen.setPageId(2);
//        System.out.println(aboutScreen.getPageId());
//        aboutScreen.setPageName("About");
//        aboutScreen.setURL("www.legionIT.com/about");
//
//        aboutScreen.openPage();
//        aboutScreen.clickButton("Exit");
//        aboutScreen.closePage();

//
//        LoginPage loginPage = new LoginPage();
//        loginPage.setPageName("LoginPage");
//        loginPage.setURL("http//...");
//
//        loginPage.openPage();
//        loginPage.setUsername("name");
//        loginPage.setPassword("123454");
//        loginPage.populateCredentials();
//        Page page = new Page();
//        page.getDeveloperName();

       LoginPage loginPage = new LoginPage();
       loginPage.setpageId(1);
       loginPage.setPageName("login");
        loginPage.getDeveloperName();

        AboutPage aboutPage = new AboutPage();
        aboutPage.getDeveloperName();



    }
}
