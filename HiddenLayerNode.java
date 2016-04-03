import java.io.BufferedWriter;
public class HiddenLayerNode {
// public double R = 1;
public double InputVector[];
public double CentreVector[];
public double output;
public double gausianresult;
public double eucleidianDistance;
public double S; // Sigma
public double N; // Learning Rate
public double C; // Coefficient
// public double error;
 HiddenLayerNode(double s, double c, double n) {
 CentreVector = new double[46];
 InputVector = new double[46];
 this.C = c;
 this.N = n;
 this.S = s;
 }
double computeEucleidianDistance() {
 double distance = 0;
 for (int i = 0; i < 46; i++) {
 distance = distance
 + Math.pow((this.InputVector[i] -
this.CentreVector[i]), 2);
 }
 distance = Math.sqrt(distance);
 eucleidianDistance = distance;
 return distance;
 }
double GaussianFunction() {
 gausianresult = Math.exp((-1 *
Math.pow(eucleidianDistance, 2))
 / Math.pow(S, 2));
 return gausianresult;
 }
double computeOutput() {
 output = this.C * this.gausianresult;
 return output;
 }
// double computeThisNeuronError(double epi8imito) {
// this.error=epi8imito-this.output;
// return this.error;
// }
public void changeC(double error, double output) {
 this.C = this.C + this.N * error * output;
 } 
public void changeCentre(double error) {
 double difference = 0;
 for (int i = 0; i < 46; i++) {
 difference = (this.N * this.C * error *
this.gausianresult * (this.InputVector[i] - this.CentreVector[i]))
 / Math.pow(this.S, 2);
 this.CentreVector[i] = this.CentreVector[i] +
difference;
 /*
 * if(this.CentreVector[i]<0){
this.CentreVector[i]=0; }
 */
 }
 }
public void changeS(double error) {
 this.S = this.S
 + (this.N * this.C * error *
this.gausianresult * this.output)
 / Math.pow(this.S, 3);
 }
public void printCentre(BufferedWriter out) {
 try {
 out.write("\nCentre = ");
 for (int i = 0; i < 4; i++) {
 out.write(this.CentreVector[i] + " ");
 }
 } catch (Exception e) {// Catch exception if any
 System.err.println("Error: " + e.getMessage());
 }
 }
}
