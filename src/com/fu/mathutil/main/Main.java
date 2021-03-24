/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil.main;

import com.fu.mathutil.MathUtility;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Tôi muốn test xem 5! có bằng 120 không?
        long expected= 120; //tôi hy vọng 120 là giá trị trả về
        int n= 5;           // nếu tôi tính 5!
        long actual= MathUtility.getFactorial(n);
                            //actual: cái value hàm thực sự trả về
        // ta đi so sánh = mắt để luận xem hàm ta viết chạy đúng hay không
        System.out.println("5!: Expected: "+ expected + "; Actual: " + actual);

        //tình huống test số 2, 0! xem sao?
        //TÌNH HUỐNG TEST, TÌNH HUỐNG XÀI, GỌI LÀ TEST CASE
        
        n=0;             //muốn tính 0!
        expected =1;     //hi vọng nhận về 1
        actual= MathUtility.getFactorial(n);  //thực tế là
        
        //dùng mắt luận kết quả 
        System.out.println("0!: Expected: "+ expected + "; Actual: " + actual);




//        System.out.println("This is my first git");
    }
//Trong quy trinh lập trình chuyên nghiệp ở các công ty, đặc biệt làm cho JP
//mọi hàm/class bạn viét ra đều phải được test kĩ càng trước khi ghép
    //nó vào trong các cụm tính năng, và ghép với UI, Back-end
    //Làm sao để test các hàm, các class
    //Có nhiều cách
    //*Cách 1: sout(kết quả xử lý của hàm)
    //*Cách 2: JOPtionPane(pop-up lên kết quả xử lý của hàm) bên java desktop
    //*Cách 3: Ghi vào LOG file trong môn Java Web, hay in kết quả xử lý ra 1 trang web tạm nào đó
    //Với 3 cách này, ta gọi hàm , nhìn kết quả trả về của hàm- ACTUAL VALUE và ta ngầm so sánh với các kếy qura mà ta tự tính toán trước đó
    // khi chưa gọi hàm, ta gọi là GIÁ TRỊ KÌ VỌNG - EXPECTED VALUE
    // nếu EXPECTED VALUE == ACTUAL VALUE (thực tế và kì vọng khớp nhau)
    // =>> HÀM CHẠY ĐÚNG
    // nếu không bằng ==> HÀM XỬ LÝ SAI
    //3 cách trên đòi hỏi DEV phải dùng mắt để luận kết quả đúng sai
    // nhiều test case cần phải test, ta rất dễ bỏ sót, nhìn sai kết quả
    //KỸ THUẬT NÀY GỌI LÀ MANUAL TEST
    //TEST KHI CODE  VỪA MỚI XONG TỪNG HÀM GỌI LÀ UNIT TEST
    
    
    // ******CÁCH 4****** (ta không cần nhìn bằng mắt từng trường hợp , ta nhờ máy so sánh giùm ACTUAL vs EXPECTED luôn
    // và nếu tất cả các tình huống đều khơps, bằng nhau, TRẢ RA 1 MÀU XANH
    //nếu HẦU HẾT  đều khớp, chỉ ít nhất 1 cái không khớp =>> HÀM KHÔNG ỔN ĐỊNH =>> TRẢ RA MÀU ĐỎ ->> CẢNH BÁO DEV CÓ TRỤC TRẶC
    // vậy lúc này ta chỉ cần nhìn vào màu là đủ, không cần luận từng kết qyar
    // Kỹ thuật này gọi là TEST DRIVER DEVELOPMENT +TEST AUTOMATION
    // vừa viết code vừa test                       tự động hoá việc test
    // Muốn làm được điều này, ta cần thêm thư viện phú trợ đẻ tung ra màu
    // thư viện này đều có tương ứng ở các ngôn ngữ lập trình
    // JAVA: JUnit, TestNG>>> 
    // C# :NUnit, xUnit, MSTEST
    // PHP :PHPUnit
    // ...
}
