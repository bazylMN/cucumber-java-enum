package glue.pageObjects;

import glue.hooks.SessionManager;

public class NavigationPageObjects {

    private SessionManager sessionManager;

    public NavigationPageObjects(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }

    public void getPage(String url) {
        sessionManager.getDriver().navigate().to(url);
    }

    public String getCurrentUrl() {
        return sessionManager.getDriver().getCurrentUrl();
    }
}
