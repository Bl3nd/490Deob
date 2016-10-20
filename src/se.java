final class se extends RuntimeException {
	
	static ob a;
	static int b = 0;
	static int c;
	static int d;
	static int e;
	static ob f = rf.a(40, "Bitte wenden Sie sich an den Kundendienst)3");
	static int g;
	Throwable h;
	static ob i;
	private static ob j = rf.a(40, "Location");
	static ob k;
	static int l;
	static int m;
	String n;
	static int o;
	
	static final af a(og var0, byte var1) {
		int var7 = client.anInt_wb;
		
		try {
			var0.readUnsignedByte(var1 + 299);
			++m;
			int var2 = var0.readUnsignedByte(255);
			af var3 = vc.a(var2, -30);
			var3.Q = var0.readUnsignedByte(255);
			int var4 = var0.readUnsignedByte(255);
			int var5 = 0;
			int var6;
			if (var1 != -44) {
				k = null;
				if (var7 != 0) {
					var6 = var0.readUnsignedByte(255);
					var3.a(var6, 123, var0);
					++var5;
				}
			}
			
			while (var5 < var4) {
				var6 = var0.readUnsignedByte(255);
				var3.a(var6, 123, var0);
				++var5;
			}
			
			var3.f(var1 + 45);
			return var3;
		} catch (RuntimeException var8) {
			throw bc.a(var8, "se.D(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}
	
	static final void a(int var0) {
		try {
			v.W.b((int) 9946);
			jc.Z.b((int) 9946);
			if (var0 != -976) {
				a(123, (byte) 77);
			}
			
			gi.x.b((int) 9946);
			++c;
			di.g.b((int) 9946);
		} catch (RuntimeException var2) {
			throw bc.a(var2, "se.A(" + var0 + ')');
		}
	}
	
	static final boolean a(int var0, byte var1) {
		try {
			++o;
			if (var1 < 24) {
				k = null;
			}
			
			return (1 & var0 >> 1228869981) != 0;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "se.C(" + var0 + ',' + var1 + ')');
		}
	}
	
	public static void b(int var0) {
		try {
			if (var0 == 35) {
				f = null;
				j = null;
				i = null;
				k = null;
				a = null;
			}
		} catch (RuntimeException var2) {
			throw var2;
		}
	}
	
	se(Throwable var1, String var2) {
		this.n = var2;
		this.h = var1;
	}
	
	static {
		a = j;
		i = rf.a(40, "<col=ff0000>");
		e = 0;
		k = rf.a(40, ": ");
	}
}
