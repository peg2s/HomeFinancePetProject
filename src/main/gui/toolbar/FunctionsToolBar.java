package main.gui.toolbar;

import main.gui.EnableEditDelete;
import main.gui.MainButton;
import settings.HandlerCode;
import settings.Style;
import settings.Text;

public final class FunctionsToolBar extends AbstractToolBar implements EnableEditDelete {

    private MainButton editButton;
    private MainButton deleteButton;

    public FunctionsToolBar() {
        //Handler handler})
        // {
        super();
        init();
    }

    @Override
    protected void init() {
        addButton(Text.get("ADD"), Style.ICON_ADD, HandlerCode.ADD, false);
        editButton = addButton(Text.get("EDIT"), Style.ICON_EDIT, HandlerCode.EDIT, false);
        deleteButton = addButton(Text.get("DELETE"), Style.ICON_DELETE, HandlerCode.DELETE, false);
    }

    @Override
    public void setEnableEditDelete(boolean enable) {
        editButton.setEnabled(enable);
        deleteButton.setEnabled(enable);
    }

}
