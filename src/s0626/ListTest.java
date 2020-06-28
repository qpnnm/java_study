package s0626;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Car> carList = new ArrayList<>();
		for (int i = 0; i < 1; i++) {
			System.out.print("자동차 정보를 , 를 기준으로 입력해주세요. :");
			// String carInfo =scan.nextLine(); 이거를 밑으로 치환 가능.
			String[] infos = scan.nextLine().split(",");
			Car c = new Car();
			c.setCarMaker(infos[0]);
			c.setName(infos[1]);
			c.setColor(infos[2]);
			c.setCc(Integer.parseInt(infos[3]));
			carList.add(c);

		}
		System.out.println(carList);
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			String url = "jdbc:mariadb://127.0.0.1:3306/java";
			String id = "root";
			String pwd = "1234";
			Connection conn = DriverManager.getConnection(url, id, pwd);
			Statement stmt = conn.createStatement();
			for (int i = 0; i < carList.size(); i++) {
				Car c = carList.get(i);
				String sql = "insert into car(NAME,carmaker,color,cc) ";
				sql += "values('" + c.getName() + "',";
				sql += "'" + c.getCarMaker() + "',";
				sql += "'" + c.getColor() + "',";
				sql += c.getCc() + ")";
				
				int result = stmt.executeUpdate(sql);
				System.out.println(sql);
				
				
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
