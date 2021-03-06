/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.network.university.accountingOrganization;

import biz.account.Account;
import java.util.ArrayList;
import javax.swing.JButton;
import ui.components.GeneralWorkArea;
import ui.components.ParentUI;

/**
 *
 * @author royn
 */
public class UniversityAccountingWorkArea extends GeneralWorkArea{

    public UniversityAccountingWorkArea(ParentUI parent, Account account) {
        super(parent, account);
    }
    
    @Override
    protected ArrayList<JButton> getButtons() {
        ArrayList<JButton> arrayList = new ArrayList<>();
        JButton btnRollUpOrder = new JButton("Manage Roll Up Order");
        btnRollUpOrder.addActionListener(e -> parent.pushComponent(new ManageRollUpOrder(account)));
        arrayList.add(btnRollUpOrder);
        return arrayList;
    }

    @Override
    public String getTitle() {
        return String.format("%s Accounting Summary", account.getOrg().getEnterprise().getNetwork());
    }
    
}
