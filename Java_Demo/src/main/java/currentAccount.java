public class currentAccount extends bankAccount {
    protected long newBalance;
    currentAccount(String Account_Name,long Account_Number,long newBalance){
        this.Account_Name=Account_Name;
        this.Account_Number=Account_Number;
        newBalance=0;
    }
}
