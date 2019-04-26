package handler;

import bean.PurchaseRequest;

/**
 * @Auther: allanyang
 * @Date: 2019/4/26 18:02
 * @Description:
 */
public abstract class Approver {

    public Approver approver;
    public String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void handle(PurchaseRequest request);
}