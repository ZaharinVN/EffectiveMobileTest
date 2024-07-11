package com.karsoft.effectivemobile.data.models;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\'\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0016J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\rH\u00c6\u0003J\t\u0010+\u001a\u00020\u0012H\u00c6\u0003J\t\u0010,\u001a\u00020\u0014H\u00c6\u0003J\t\u0010-\u001a\u00020\u0007H\u00c6\u0003J\t\u0010.\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u00100\u001a\u00020\u0007H\u00c6\u0003J\t\u00101\u001a\u00020\u0005H\u00c6\u0003J\t\u00102\u001a\u00020\u000bH\u00c6\u0003J\t\u00103\u001a\u00020\rH\u00c6\u0003J\t\u00104\u001a\u00020\rH\u00c6\u0003J\t\u00105\u001a\u00020\rH\u00c6\u0003J\u008d\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0007H\u00c6\u0001J\u0013\u00107\u001a\u00020\r2\b\u00108\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00109\u001a\u00020\u0003H\u00d6\u0001J\t\u0010:\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000e\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010 R\u0011\u0010\u0010\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010 R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0011\u0010\u0015\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001a\u00a8\u0006;"}, d2 = {"Lcom/karsoft/effectivemobile/data/models/TicketResponse;", "", "id", "", "arrival", "Lcom/karsoft/effectivemobile/data/models/DepartureResponse;", "badge", "", "company", "departure", "hand_luggage", "Lcom/karsoft/effectivemobile/data/models/HandLuggageResponse;", "has_transfer", "", "has_visa_transfer", "is_exchangable", "is_returnable", "luggage", "Lcom/karsoft/effectivemobile/data/models/LuggageResponse;", "price", "Lcom/karsoft/effectivemobile/data/models/PriceResponse;", "provider_name", "(ILcom/karsoft/effectivemobile/data/models/DepartureResponse;Ljava/lang/String;Ljava/lang/String;Lcom/karsoft/effectivemobile/data/models/DepartureResponse;Lcom/karsoft/effectivemobile/data/models/HandLuggageResponse;ZZZZLcom/karsoft/effectivemobile/data/models/LuggageResponse;Lcom/karsoft/effectivemobile/data/models/PriceResponse;Ljava/lang/String;)V", "getArrival", "()Lcom/karsoft/effectivemobile/data/models/DepartureResponse;", "getBadge", "()Ljava/lang/String;", "getCompany", "getDeparture", "getHand_luggage", "()Lcom/karsoft/effectivemobile/data/models/HandLuggageResponse;", "getHas_transfer", "()Z", "getHas_visa_transfer", "getId", "()I", "getLuggage", "()Lcom/karsoft/effectivemobile/data/models/LuggageResponse;", "getPrice", "()Lcom/karsoft/effectivemobile/data/models/PriceResponse;", "getProvider_name", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "data_debug"})
public final class TicketResponse {
    private final int id = 0;
    @org.jetbrains.annotations.NotNull
    private final com.karsoft.effectivemobile.data.models.DepartureResponse arrival = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String badge = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String company = null;
    @org.jetbrains.annotations.NotNull
    private final com.karsoft.effectivemobile.data.models.DepartureResponse departure = null;
    @org.jetbrains.annotations.NotNull
    private final com.karsoft.effectivemobile.data.models.HandLuggageResponse hand_luggage = null;
    private final boolean has_transfer = false;
    private final boolean has_visa_transfer = false;
    private final boolean is_exchangable = false;
    private final boolean is_returnable = false;
    @org.jetbrains.annotations.NotNull
    private final com.karsoft.effectivemobile.data.models.LuggageResponse luggage = null;
    @org.jetbrains.annotations.NotNull
    private final com.karsoft.effectivemobile.data.models.PriceResponse price = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String provider_name = null;
    
    public TicketResponse(int id, @org.jetbrains.annotations.NotNull
    com.karsoft.effectivemobile.data.models.DepartureResponse arrival, @org.jetbrains.annotations.Nullable
    java.lang.String badge, @org.jetbrains.annotations.NotNull
    java.lang.String company, @org.jetbrains.annotations.NotNull
    com.karsoft.effectivemobile.data.models.DepartureResponse departure, @org.jetbrains.annotations.NotNull
    com.karsoft.effectivemobile.data.models.HandLuggageResponse hand_luggage, boolean has_transfer, boolean has_visa_transfer, boolean is_exchangable, boolean is_returnable, @org.jetbrains.annotations.NotNull
    com.karsoft.effectivemobile.data.models.LuggageResponse luggage, @org.jetbrains.annotations.NotNull
    com.karsoft.effectivemobile.data.models.PriceResponse price, @org.jetbrains.annotations.NotNull
    java.lang.String provider_name) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.karsoft.effectivemobile.data.models.DepartureResponse getArrival() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBadge() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCompany() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.karsoft.effectivemobile.data.models.DepartureResponse getDeparture() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.karsoft.effectivemobile.data.models.HandLuggageResponse getHand_luggage() {
        return null;
    }
    
    public final boolean getHas_transfer() {
        return false;
    }
    
    public final boolean getHas_visa_transfer() {
        return false;
    }
    
    public final boolean is_exchangable() {
        return false;
    }
    
    public final boolean is_returnable() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.karsoft.effectivemobile.data.models.LuggageResponse getLuggage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.karsoft.effectivemobile.data.models.PriceResponse getPrice() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getProvider_name() {
        return null;
    }
    
    public final int component1() {
        return 0;
    }
    
    public final boolean component10() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.karsoft.effectivemobile.data.models.LuggageResponse component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.karsoft.effectivemobile.data.models.PriceResponse component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.karsoft.effectivemobile.data.models.DepartureResponse component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.karsoft.effectivemobile.data.models.DepartureResponse component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.karsoft.effectivemobile.data.models.HandLuggageResponse component6() {
        return null;
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final boolean component9() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.karsoft.effectivemobile.data.models.TicketResponse copy(int id, @org.jetbrains.annotations.NotNull
    com.karsoft.effectivemobile.data.models.DepartureResponse arrival, @org.jetbrains.annotations.Nullable
    java.lang.String badge, @org.jetbrains.annotations.NotNull
    java.lang.String company, @org.jetbrains.annotations.NotNull
    com.karsoft.effectivemobile.data.models.DepartureResponse departure, @org.jetbrains.annotations.NotNull
    com.karsoft.effectivemobile.data.models.HandLuggageResponse hand_luggage, boolean has_transfer, boolean has_visa_transfer, boolean is_exchangable, boolean is_returnable, @org.jetbrains.annotations.NotNull
    com.karsoft.effectivemobile.data.models.LuggageResponse luggage, @org.jetbrains.annotations.NotNull
    com.karsoft.effectivemobile.data.models.PriceResponse price, @org.jetbrains.annotations.NotNull
    java.lang.String provider_name) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}