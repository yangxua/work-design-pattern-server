package concretehandler;

import bean.PurchaseRequest;
import handler.Approver;

/**
 * @Auther: allanyang
 * @Date: 2019/4/26 18:16
 * @Description:
 */
public class VicePresident extends Approver {

    public VicePresident(String name) {
        super(name);
    }

    @Override
    public void handle(PurchaseRequest request) {
        if (request.getAmount() < 100000) {
            System.out.println("副董事长" + this.name + "审批采购单：" + request.getNumber() + "，金额：" + request.getAmount() + "元，采购目的：" + request.getPurpose() + "。");  //处理请求
        } else {
            this.approver.handle(request);
        }
    }
}