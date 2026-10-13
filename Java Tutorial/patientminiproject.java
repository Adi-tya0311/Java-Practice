import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SuppressWarnings("unused")

class Patient { int id; String name; int age; String disease; String doctor; String ward; double bill; boolean admitted;

public Patient(int id, String name, int age, String disease, String doctor, String ward, double bill, boolean admitted) { 
    this.id = id; 
    this.name = name; 
    this.age = age; 
    this.disease = disease; 
    this.doctor = doctor; 
    this.ward = ward; 
    this.bill = bill; 
    this.admitted = admitted; }

public String toString() { return "Patient ID : " + id + "\nName : " + name + "\nAge : " + age + "\nDisease : " + disease + "\nDoctor : " + doctor + "\nWard : " + ward + "\nBill : ₹" + bill + "\nAdmitted : " + admitted + "\n----------------------------"; } }

public class patientminiproject {
    public static void main(String[] args) { 
        List<Patient> patients = Arrays.asList(
            new Patient(101, "Rahul", 25, "Fever", "Dr. Mehta", "General", 1200, true),
            new Patient(102, "Sneha", 32, "Diabetes", "Dr. Shah", "ICU", 25000, true),
            new Patient(103, "Amit", 45, "Heart", "Dr. Patil", "ICU", 80000, true),
            new Patient(104, "Priya", 20, "Fracture", "Dr. Joshi", "Ortho", 15000, false),
            new Patient(105, "Rohan", 19, "Cancer", "Dr. Shah", "ICU", 150000, true),
            new Patient(106, "Neha", 28, "Fever", "Dr. Mehta", "General", 1800, false),
            new Patient(107, "Karan", 35, "Covid", "Dr. Patil", "Isolation", 10000, true),
            new Patient(108, "Pooja", 24, "Migraine", "Dr. Mehta", "General", 2500, false) ); 
        
            //ALl admitted patients
            // patients.stream().filter((p)->p.admitted).forEach(System.out::println);
            //All non admitted patients
            // patients.stream().filter(p->!p.admitted).forEach(System.out::println);

            //Using map
            // Map<Boolean,List<Patient>> p=patients.stream().collect(Collectors.partitioningBy((x)->x.admitted));
            // p.forEach((status,list)->{
            //     System.out.println(status?"Admitted":"Discharged");
            //     list.forEach(System.out::println);
            //     }
            // );

            //Checking for a specific patient
            //patients.stream().filter((g)->g.name.equals("Pooja")).forEach(System.out::println);
            //patients.stream().filter((g)->g.disease.equals("Cancer")).forEach(System.out::println);

            //list only all the types of diesease of patients
            //patients.stream().map((g)->g.disease).forEach(System.out::println);

            //list two fields
            //patients.stream().map((g)->(g.id)+" "+(g.name)).forEach(System.out::println);

            //patient names to uppercase
            //patients.stream().map((g)->g.name.toUpperCase()).forEach(System.out::println);

            //distinct doctors
            //patients.stream().map((g)->g.doctor).distinct().forEach(System.out::println);

            //sort and print bill
            //patients.stream().sorted(Comparator.comparingDouble((g)->g.bill)).forEach(System.out::println);

            //sort name
            //patients.stream().sorted(Comparator.comparing((p)->p.name)).forEach(System.out::println);

            //Display top 3 money bills (Not understood)
            //patients.stream().sorted((a,b)->Double.compare(b.bill, a.bill)).limit(3).forEach(System.out::println);

            //skip first 3 patients
            //patients.stream().skip(3).forEach(System.out::println);

            //total patients count
            //System.out.println(patients.stream().count());

            //Highest bill
            // System.out.println(patients.stream().max(Comparator.comparingDouble((p)->p.bill)).get());

            //Lowest Bill
            //System.out.println(patients.stream().min(Comparator.comparingDouble((p)->p.bill)).get());

            //Total bill of all patients
            //System.out.println(patients.stream().mapToDouble((p)->p.bill).sum());

            //First icu patient
            //System.out.println(patients.stream().filter((g)->g.ward.equals("ICU")).findFirst().get());

            //anymatch- check if available in list or not
            //System.out.println(patients.stream().anyMatch((g)->g.disease.equals("Dengue")));

            //Check if all are adults or not
            //System.out.println(patients.stream().allMatch((g)->g.age>18));

            //System.out.println(patients.stream().noneMatch((g)->g.disease.equals("Tuberculosis")));

            Map<String,List<Patient>>  doclist = patients.stream().collect(Collectors.groupingBy((g)->g.doctor));//incomplete
            System.out.println(doclist);
    } 
}

