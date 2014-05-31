package hellomongo;

import com.google.common.base.Charsets;
import restx.mongo.MongoModule;
import restx.security.SignatureKey;
import restx.factory.Module;
import restx.factory.Provides;

import javax.inject.Named;

@Module
public class AppModule {
    @Provides
    public SignatureKey signatureKey() {
         return new SignatureKey("3685755889849339038 636b37d4-f945-4a6b-8fea-31900e12861a restx-samples-hellomongo restx-samples-hellomongo".getBytes(Charsets.UTF_8));
    }

    @Provides @Named(MongoModule.MONGO_DB_NAME)
    public String dbName() {
        return "restx-hellomongo";
    }
}
