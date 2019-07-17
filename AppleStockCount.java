public class AppleStockCount {
	public static void main(String[] args) {

		StringBuilder message = new StringBuilder();
		if (args.length < 2) {
			System.out.println("Please enter both quantity and cost.");
			return;
		} else {
			int quantity = Integer.parseInt(args[0]);
			double cost = Double.parseDouble(args[1]);
			double total = quantity * cost;
			int dozens = quantity / 12;
			if (quantity == 0 || cost == 0) {
				System.out.println("Price and cost need to be greater than zero.");
				return;
			} else {
				message.append("You have bought ");
				if (quantity % 12 == 0) {
					message.append(dozens);
					message.append(" dozen");
					if (dozens > 1) {
						message.append("s");
					}
					message.append(" of apples");
				} else {
					message.append(quantity);
					message.append(" apple");
					if (quantity > 1) {
						message.append("s");
					}
				}
				message.append(" for a total of R");
				message.append(String.format("%.2f", total));
			}
			System.out.println(message.toString());
		}
	}
}
