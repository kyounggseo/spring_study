package hello.hellospring.controller;

import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members/new")
    public String createForm() {
        return "members/createMemberForm";
    }

    @PostMapping("/members/new") // 회원가입 창을 만들어줌
    public String create(MemberForm form) {
        Member member = new Member();
        member.setName(form.getName());

        // System.out.println("member = " + member.getName()); // 터미널에서 8080 http 들어가서 입력한 것을 출력해보가

        memberService.join(member);

        return "redirect:/";
    }

    @GetMapping("/members") // 회원목록을 보여줌
    public String list(Model model) {
        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members); // members 값들을 model 에 담아서 화면에 표시
        return "members/memberList";

    }

}
