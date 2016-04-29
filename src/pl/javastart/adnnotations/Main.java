package pl.javastart.adnnotations;

import java.lang.reflect.Field;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		User user = new User();

		Field[] fields = user.getClass().getDeclaredFields();

		for (Field field : fields) {
			if(field.isAnnotationPresent(DatabaseField.class)) {
				DatabaseField databaseField = field.getAnnotation(DatabaseField.class);
				System.out.println("Field name: "+field.getName() + " | Column name: " + databaseField.columnName());
			}
		}
	}

}


