public class AppleStockCount {
	public static void main(String[] args) {

		StringBuilder message = new StringBuilder();
		int quantity = Integer.parseInt(args[0]);
		double cost = Double.parseDouble(args[1]);
		double total = quantity * cost;
		int messages = quantity/12;

		if (quantity <= 0) {
			System.out.println("Out of stock.");
			return;
		}
		else if (cost <= 0) {
			System.out.println("Price cannot be less than zero");
			return;
		}
		else {
			if (quantity%12 == 0) {
				message.append("You have bought ");
				message.append(messages);
				message.append(" dozen");
				if (messages > 1) {
					message.append("s");
				}
				message.append(" of apples for a total of R");
				message.append(total);

			}
			else {
				message.append("You bought ");
				message.append(quantity);
				message.append(" apple");
				if (quantity > 1) {
					message.append("s");
				}
				message.append(" for a total of R");
				message.append(total);
			}
		}
		System.out.println(message.toString());
	}
}
