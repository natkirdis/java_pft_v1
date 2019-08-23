package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    int before = app.getContactHelper().getGroupCount();
    app.getGroupHelper().createGroup(new GroupData("test1", "test2", null));
    int after = app.getContactHelper().getGroupCount();
    Assert.assertEquals(after, before + 1);
  }

}
