/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil.test;

import com.fu.mathutil.MathUtility;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class MathUtilityTest {
    
    // ta sẽ viết những đoạn code ở đây để test hàm chính getFactorial()
    // bên MathUtility coi chạy có đúng k
    // viết code để test code chính
    // đúng sai ở đây dùng màu sắc XANH ĐỎ
    @Test //biến hàm thường thành hàm main()
    public void testFactorialGivenRightArgumentReturnsGoodResult(){
        long expected=120;      // tui hi vọng trả về 120
        int n=5;                // tui muốn tính 5!
        long actual= MathUtility.getFactorial(n);
        assertEquals(expected, actual);
        //khớp màu xanh, sai lệch màu đỏ
        // màu xanh xuát hiện khi tất cả các tình huống xài hàm 
        //test case đều xanh
        //màu đỏ xuất hiện ngay khi có ít nhất 1 thằng đỏ
        //                      một test case sai, tất cả bỏ
        //ẩn ý: hàm đã đúng thì phải đúng cho tất cả các case mình test
        
        assertEquals(720, MathUtility.getFactorial(6)); //ktra xem 6! có bằng 720 không
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(1, MathUtility.getFactorial(0));
        //  Khi màu đỏ thì có 2 tình huống : + hàm bạn tính sai ko như kì vọng
                                        //   + hàm tính đúng, bạn kì vọng sai
                                        
        //ta sẽ đi test hàm có ném ra ngoại lệ như thiết kế hay không
        //hàm được thiết kế rằng: đưa tham số n0..20 -> tính đsung n!
        //hàm được thiết kế rằng: đưa tham số cà chớn, < 0 > 20
        //                          ném ra ngoại lệ cảnh báo sai tham số, ngoài miền giá trị tính
        //chốt: đưa tham số cà chớn phải ném về ngoại lệ
        //      nếu thấy đúng là ném về ngoại lệ khi đưa tham số cà chớn thì kết luận hàm đsung , xanh
        // thấy ngoại lệ khi đưa n cà chớn, mừng rơi nc mắt vì hàm chạy đúng như thiết kế
        // ngoại lệ xuất hiện 5! thì là hàm đúng mà
        // ngoại lệ thù ko phải là giá trị để so sánh kiểu assertEquals()
        // vậy ta phải dùng kiểu khác
        
    }
    
    @Test(expected =    Exception.class) // không nên bắt mức cao nhất mặc dù k sai
        public void getFactorialGivenWrongArgumentThrowsException(){
        MathUtility.getFactorial(40);
        MathUtility.getFactorial(-40);
        // 2 thằng này phải ném về ngạoi lệ IllegalArgumentException
    }
}
    

