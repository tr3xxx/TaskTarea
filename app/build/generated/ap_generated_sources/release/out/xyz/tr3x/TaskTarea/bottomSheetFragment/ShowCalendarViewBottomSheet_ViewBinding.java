// Generated code from Butter Knife. Do not modify!
package xyz.tr3x.TaskTarea.bottomSheetFragment;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.applandeo.materialcalendarview.CalendarView;
import java.lang.IllegalStateException;
import java.lang.Override;
import xyz.tr3x.TaskTarea.R;

public class ShowCalendarViewBottomSheet_ViewBinding implements Unbinder {
  private ShowCalendarViewBottomSheet target;

  @UiThread
  public ShowCalendarViewBottomSheet_ViewBinding(ShowCalendarViewBottomSheet target, View source) {
    this.target = target;

    target.back = Utils.findRequiredViewAsType(source, R.id.back, "field 'back'", ImageView.class);
    target.calendarView = Utils.findRequiredViewAsType(source, R.id.calendarView, "field 'calendarView'", CalendarView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ShowCalendarViewBottomSheet target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.back = null;
    target.calendarView = null;
  }
}
