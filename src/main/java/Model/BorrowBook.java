/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Model;

/**
 *
 * @author HELLO
 */
public class BorrowBook {

    private Integer BookId;
    private Integer CusId;
    private String Name;
    private Integer Amount;
    private String BorrowDate;
    private String PayDate;

    public BorrowBook() {
    }

    public BorrowBook(Integer BookId, Integer CusId, String Name, Integer Amount, String BorrowDate, String PayDate) {
        this.BookId = BookId;
        this.CusId = CusId;
        this.Name = Name;
        this.Amount = Amount;
        this.BorrowDate = BorrowDate;
        this.PayDate = PayDate;
    }

    public BorrowBook(Integer BookId, Integer CusId, String Name, Integer Amount) {
        this.BookId = BookId;
        this.CusId = CusId;
        this.Name = Name;
        this.Amount = Amount;
    }

    public Integer getBookId() {
        return BookId;
    }

    public void setBookId(Integer BookId) {
        this.BookId = BookId;
    }

    public Integer getCusId() {
        return CusId;
    }

    public void setCusId(Integer CusId) {
        this.CusId = CusId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Integer getAmount() {
        return Amount;
    }

    public void setAmount(Integer Amount) {
        this.Amount = Amount;
    }

    public String getBorrowDate() {
        return BorrowDate;
    }

    public void setBorrowDate(String BorrowDate) {
        this.BorrowDate = BorrowDate;
    }

    public String getPayDate() {
        return PayDate;
    }

    public void setPayDate(String PayDate) {
        this.PayDate = PayDate;
    }

    @Override
    public String toString() {
        return "BorrowBook{" + "BookId=" + BookId + ", CusId=" + CusId + ", Name=" + Name + ", Amount=" + Amount + ", BorrowDate=" + BorrowDate + ", PayDate=" + PayDate + '}';
    }

   
}
