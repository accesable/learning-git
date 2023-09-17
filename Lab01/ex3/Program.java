import java.util.List;

public class Program {
    public static void main(String[] args) {
        
        // 1. khởi tạo danh sách sinh viên
        System.out.println("Create Student List");
        List<Student> list = StudentUtils.generate();
        StudentUtils.print(list);
        List<String> stringArray = StudentUtils.goodStudentName(list);

        // 2. sắp xếp theo tên và in ra kết quả
        System.out.println("Print out the Name in Ascending Order");
        StudentUtils.sortByName(list);
        StudentUtils.print(list);
        // StudentUtils.print(list);
        
        System.out.println("Print The Average Score of All Students");
        System.out.println(StudentUtils.avg(list));

        System.out.println("Print Out Age Descending");
        StudentUtils.sortByAgeDescending(list);
        StudentUtils.print(list);

        System.out.println("Print Out Average Score Ascending");
        StudentUtils.sortByAvg(list);
        StudentUtils.print(list);

        System.out.println("Print Out Good Student");
        for(String i : stringArray){
            System.out.println(i);
        }

        // 3. sắp xếp tăng dần theo điểm trung bình và in ra kết quả
        // StudentUtils.sortByAvg(list);
        // StudentUtils.print(list);

    
    }
}
