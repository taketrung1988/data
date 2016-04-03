public class OutputNode {
public double input[];
double sum = 0;
double error;
 OutputNode() {
 input = new
double[TrainingProcedure.NUMBER_OF_HIDDEN_LAYER_NODES];
 }
double computeSum() {
 this.sum=0;
 for (int i = 0; i <
TrainingProcedure.NUMBER_OF_HIDDEN_LAYER_NODES; i++) {
 this.sum = this.sum + input[i];
 }
 return sum;
 }
double computeError(double epi8imito, double pragmatiko) {
 //error = Math.pow(epi8imito - pragmatiko, 2) / 2;
 error =epi8imito - pragmatiko;
 return error;
 }
}
