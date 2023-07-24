package user.library.verification;

import user.library.verification.contracts.Verifier;
import user.repositories.contracts.VerificationCodeRepository;

public class SmsCodeVerifier implements Verifier {
    private VerificationCodeRepository codeRepository;

    public SmsCodeVerifier() {
    }

    @Override
    public boolean verify() {
        return false;
    }
}
