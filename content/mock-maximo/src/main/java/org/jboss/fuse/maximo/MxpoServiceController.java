package org.jboss.fuse.maximo;

import java.util.concurrent.atomic.AtomicLong;

import org.jboss.fuse.maximo.model.Factory;
import org.jboss.fuse.maximo.model.Mxpo;
import org.jboss.fuse.maximo.model.MxpoURL;
import org.jboss.fuse.maximo.model.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author kylin
 *
 */
@RestController
public class MxpoServiceController {
	
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/maximo/ping")
    public Response greeting() {
        return new Response(counter.getAndIncrement(), "Success!");
    }
	
	@RequestMapping("/maximo/oslc/os/mxpo/rp3iU3546m5S6Y9bGJGwI")
    public Mxpo mxpo1() {
        return Factory.mxpo();
    }
	
	@RequestMapping("/maximo/oslc/os/mxpo/Q6tXdwb4cgDRCfwzyBAGg")
    public Mxpo mxpo2() {
        return Factory.mxpo();
    }
	
	@RequestMapping("/maximo/oslc/os/mxpo/fgfNyxzyHGhryzUbEJ1uY")
    public Mxpo mxpo3() {
		return Factory.mxpo();
    }
	
	@RequestMapping("/maximo/oslc/os/mxpo/4XUWJcgdJscpe1TBSoOB0")
    public Mxpo mxpo4() {
		return Factory.mxpo();
    }
	
	@RequestMapping("/maximo/oslc/os/mxpo/NO0T3MB8gC1AwChEwpz3x")
    public Mxpo mxpo5() {
        return Factory.mxpo();
    }
	
	@RequestMapping("/maximo/oslc/os/mxpo/DqEjXAPwtErImCu3yo1TX")
    public Mxpo mxpo6() {
        return Factory.mxpo();
    }
	
	@RequestMapping("/maximo/oslc/os/mxpo/7jQfgib3POV8yAmvQM3BR")
    public Mxpo mxpo7() {
        return Factory.mxpo();
    }
	
	@RequestMapping("/maximo/oslc/os/mxpo/dPfc3IzW7LSvhYr6qkFpc")
    public Mxpo mxpo8() {
        return Factory.mxpo();
    }
	
	@RequestMapping("/maximo/oslc/os/mxpo/lCrUxsLRUJo3s2QIfIJ9h")
    public Mxpo mxpo9() {
        return Factory.mxpo();
    }
	
	@RequestMapping("/maximo/oslc/os/mxpo/UWVMqgsUGCfkuSUbBPAYJ")
    public Mxpo mxpo10() {
        return Factory.mxpo();
    }
	
	@RequestMapping("/maximo/oslc/os/mxpo")
    public MxpoURL mxpoURLS(@RequestParam(value="lean")Integer lean, @RequestParam(value="_lid")String lid, @RequestParam(value="_lpwd")String lpwd) {
        
		System.out.println("/maximo/oslc/os/mxpo be invoked");
		return Factory.urls();
    }



	
}
