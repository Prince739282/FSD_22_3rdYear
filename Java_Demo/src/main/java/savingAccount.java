public class savingAccount extends bankAccount {
    protected long newBalance;
    savingAccount(String Account_Name,long Account_Number,long newBalance){
        this.Account_Name=Account_Name;
        this.Account_Number=Account_Number;
        newBalance=0;
    }

}
