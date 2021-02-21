package OOPs.GradeProject;


public class Grade {
    private String subject;
    private double score;
    private boolean did_pass;

    public Grade(String subject, double score, boolean did_pass) {
        this.subject = subject;
        this.score = score;
        this.did_pass = did_pass;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public boolean isDid_pass() {
        return did_pass;
    }

    public void setDid_pass(boolean did_pass) {
        this.did_pass = did_pass;
    }



    //Optional - Auto-generated
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (did_pass ? 1231 : 1237);
        long temp;
        temp = Double.doubleToLongBits(score);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((subject == null) ? 0 : subject.hashCode());
        return result;
    }

    //Optional - Auto-generated
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Grade other = (Grade) obj;
        if (did_pass != other.did_pass)
            return false;
        if (Double.doubleToLongBits(score) != Double.doubleToLongBits(other.score))
            return false;
        if (subject == null) {
            if (other.subject != null)
                return false;
        } else if (!subject.equals(other.subject))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Grade [did_pass=" + did_pass + ", score=" + score + ", subject=" + subject + "]";
    }

    

}