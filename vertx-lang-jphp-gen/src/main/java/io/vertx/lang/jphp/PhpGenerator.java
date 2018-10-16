package io.vertx.lang.jphp;

import io.vertx.codegen.Generator;
import io.vertx.codegen.Model;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;

abstract class PhpGenerator<M extends Model> extends Generator<M> {
    static final String id = "jphp";
    PhpGenerator(){
        this.name = "JPhp";
    }
    @Override
    public String render(M model, int index, int size, Map<String, Object> session) {
        StringWriter buffer = new StringWriter();
        PrintWriter writer = new PrintWriter(buffer);
        render(model, index, size, session, writer);
        return buffer.toString();
    }

    abstract void render(M model, int index, int size, Map<String, Object> session, PrintWriter writer);
}
