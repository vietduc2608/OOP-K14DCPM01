package oo;

public class lythuyet {

    //Constructor - hàm tạo
    //Muốn có object cần:
    // Thiết kế class / Kiểu dữ liệu tham chiếu object
    // Thiết kế constructor cho class
    // Khi chương trình chạy, Compiler sẽ dùng các constructor này để khởi tạo object trong Heap
    
    // Hàm tạo / method tạo/ constructor có đặc điểm:
    // Tên giống tên class
    // Không có kiểu trả về
    // Nếu class chưa có constructor 
    // Compiler sẽ tự động tạo constructor mặc định cho class

    // 3 bước tạo và sử dụng object
    // Bước 1: Khai báo biến tham chiếu object
    // Sử dụng kiểu dữ liệu tham chiếu đối tượng / class
    // Bước 2: khởi tạo object
    // Sử dụng toán tử new
    // Tạo đối tượng trong vùng nhớ Heap
    // Bước 3: Liên kết biến tham chiếu đến object trong vùng nhớ Heap

    // Object Reference và  Object
    //-Tham chiếu object:
    // Biến có kiểu dữ liệu tham chiếu object
    //-Object sinh ra và tồn tại trong Heap
    //-Reference
    // Chiếu/ liên kết đến object
    // Điều khiển/ truy cập object
    //-References không phải object

    // Biến có kiểu cơ bản
    // Chứa giá trị cơ bản
    // Là các bit tương ứng với giá trị
    // 7 <=> 00000111
    // Biến tham chiếu đối tượng
    // Chứa giá trị gì?
    // Cũng là các bit (không cần biết là gì)
    // Đại diện cho cách truy cập và điều khiển object trong Heap

    // Tham chiếu this
    // -Object tồn tại trong Heap 
    // Chắc chắn phải có 1 reference (remote) liên kết (chiếu) tới nó
    // -Từ khóa this trong java
    // Là 1 reference đặc biệt
    // Chứa giá trị 
    // Là giá trị của tham chiếu tới object
    // -tom.display()
    // this có giá trị bằng với giá trị của reference tom
    // -Jerry.display()
    // this có giá trị bằng với giá trị của reference jerry
    // -Được dùng trong các method hoặc constructor
    // Khi liên kết reference đến 1 object trong Heap hoặc
    // Dùng 1 reference gọi đến 1 behavior (method) của object
    // Thì reference đó được truyền vào method hay constructor dưới dạng một tham số ẩn
    // Tham chiếu this – tham chiếu của đối tượng hiện hành
    // -Dùng để truy cập các biến state hoặc gọi behavior /method của object hiện hành
    // -Truy cập đến constructor khác trong class
    // -Được dùng như giá trị trả về của method

    // Class và Object
    // attribute (thuộc tính) -data - state
    // method - functions - behavior (hành vi)
    // class là khuôn mẫu để tạo object chứ  ko phải là object-được sinh ra từ class
    // 1 class có thể tạo ra nhiều object
    // nhiều object đc sinh ra tử 1 class
    // dối tượng sinh ra khi ct chạy 
    // Các object tồn tại trong Heap
    // muốn tạo đối tượng phải có constructor

    // State và Behavior của object
    // Các object của cùng 1 class
    // Có các biến object giống nhau
    // Các biến object có giá trị nhác nhau
    // identity: phân biệt các object với nhau
    // Có cùng behavior (object method )
    // -1 behavior (method) của 1 object có thể
    // dùng giá trị của các biến state và
    // Thay đổi state của object
    // -1 behavior (method) có thể
    // Sử dụng biến state của object vào trong hành vi cụ thể của mình
    // Do đó, các object khác nhau của cùng 1 class
    // +Có thể thực hiện hành vi 1 cách khác nhau
    // +Vì các biến state của các object khác nhau chứa giá trị khác nhau (dù cùng 1 class)

    // State và behavior
    // State ảnh hưởng đến behavior
    // State khác nhau khiến hành vi khác nhau
    // Behavior tác động lên state
    // Hành vi thay đổi trạng thái
    // Thay đổi giá trị của các biến state
    
    





}
