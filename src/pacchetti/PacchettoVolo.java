package pacchetti;

    import java.util.Objects;

    public class PacchettoVolo extends PacchettoViaggi{
        private boolean isAndata;

        public PacchettoVolo (String destinazione, int durata, double costo, boolean isAndata){
            super(destinazione, durata, costo);
            this.isAndata=isAndata;
        }

        public boolean isAndata() {
            return isAndata;
        }

        public void setAndata(boolean andata) {
            isAndata = andata;
        }

        public String toString() {
            return super.toString()+"è solo andata: "+isAndata;
        }


        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            PacchettoVolo that = (PacchettoVolo) o;
            return isAndata == that.isAndata;
        }

        public void costovolo(double costo){
            if(isAndata){

            }
        }
    }

