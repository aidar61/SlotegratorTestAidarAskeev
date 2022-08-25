package UI.pom.base;

import UI.helper.ActionHelper;
import UI.helper.Helper;
import UI.helper.SelectHelper;
import UI.helper.TableHelper;

public class BasePage {
    protected Helper helper = new Helper();
    protected SelectHelper selectHelper = new SelectHelper();
    protected ActionHelper actionHelper = new ActionHelper();
    protected TableHelper tableHelper = new TableHelper();
}
