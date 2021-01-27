
public class Inf {
  private String mat;
    private String prAp;
    private String segAp;
    private String nom;
/* mat = matricula
   prAp = primer Apellido;
   segAp = segundo Apellido;
   nom = nombre */

        public Inf(String mat, String prAp, String segAp, String nom) {
            this.mat = mat;
            this.prAp = prAp;
            this.segAp = segAp;
            this.nom = nom;
        }

        public String getMat() {
            return mat;
        }

        public void setMat(String mat) {
            this.mat = mat;
        }

        public String getPrAp() {
            return prAp;
        }

        public void setPrAp(String prAp) {
            this.prAp = prAp;
        }

        public String getSegAp() {
            return segAp;
        }

        public void setSegAp(String segAp) {
            this.segAp = segAp;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }
    

        @Override
        public String toString() {
            return "Inf{" + "mat=" + mat + ", prAp=" + prAp + ", segAp=" + segAp + ", nom=" + nom + '}';
        }

    
}
