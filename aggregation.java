class aggregation{

    public static class Address{
        String city, state, country;

        public Address(String city, String state, String country){
            this.city = city;   
            this.state = state;
            this.country = country;
        }
    }

    public static class Employee{
        int id; String name; String desig;
        Address add;        //refrence to Address class

        public Employee(int id, String name, String desig, Address add){
            this.id = id;
            this.name = name;
            this.add = add;
            this.desig = desig;
        }

        public void disp(){
            System.out.println("Name of the employee is: " + name);
            System.out.println("ID of the employee is: " + id);
            System.out.println("Designation of the employee is: " + desig);
            System.out.println("Address of " + name + " is " + add.city + " " + add.state + " " + add.country);
        }
    }

        public static void main(String[] args) {
            Address a = new Address("Los Angeles", "California", "US");
            Employee e = new Employee(101, "Harsh Negi","Manager", a);
            e.disp();
        }
}